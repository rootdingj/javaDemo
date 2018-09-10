package com.exam.util;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

/** 
 * @ClassName SortUtil  
 * @Description 排序工具类 
 * @author dingj 
 * @date 2018年7月20日  
 *   
 */
@SuppressWarnings({ "rawtypes", "unchecked" })
public class SortUtil {
	public static final String DESC = "desc";
	public static final String ASC = "asc";

	/** 
	 * @Title: sort 
	 * @Description: 对list中的元素进行排序 
	 * @param list 排序集合
	 * @param field 排序字段
	 * @param sort 排序方式: SortList.DESC(降序) SortList.ASC(升序)
	 * @return 参数说明
	 * @return List<?>    返回类型
	 */
	public static List<?> sort(List<?> list, final String field, final String sort) {
		Collections.sort(list, new Comparator() {
			public int compare(Object a, Object b) {
				int ret = 0;
				try {
					Field f = a.getClass().getDeclaredField(field);
					f.setAccessible(true);
					Class<?> type = f.getType();
					if (type == int.class) {
						ret = ((Integer) f.getInt(a)).compareTo((Integer) f.getInt(b));
					} else if (type == double.class) {
						ret = ((Double) f.getDouble(a)).compareTo((Double) f.getDouble(b));
					} else if (type == long.class) {
						ret = ((Long) f.getLong(a)).compareTo((Long) f.getLong(b));
					} else if (type == float.class) {
						ret = ((Float) f.getFloat(a)).compareTo((Float) f.getFloat(b));
					} else if (type == Date.class) {
						ret = ((Date) f.get(a)).compareTo((Date) f.get(b));
					} else if (isImplementsOf(type, Comparable.class)) {
						ret = ((Comparable) f.get(a)).compareTo((Comparable) f.get(b));
					} else {
						ret = String.valueOf(f.get(a)).compareTo(String.valueOf(f.get(b)));
					}
				} catch (SecurityException e) {
					e.printStackTrace();
				} catch (NoSuchFieldException e) {
					e.printStackTrace();
				} catch (IllegalArgumentException e) {
					e.printStackTrace();
				} catch (IllegalAccessException e) {
					e.printStackTrace();
				}
				if (sort != null && sort.toLowerCase().equals(DESC)) {
					return -ret;
				} else {
					return ret;
				}
			}
		});
		return list;
	}

	/**
	 * 判断对象实现的所有接口中是否包含szInterface
	 * 
	 * @param clazz
	 * @param szInterface
	 * @return
	 */
	public static boolean isImplementsOf(Class<?> clazz, Class<?> szInterface) {
		boolean flag = false;
		Class<?>[] face = clazz.getInterfaces();
		for (Class<?> c : face) {
			if (c == szInterface) {
				flag = true;
			} else {
				flag = isImplementsOf(c, szInterface);
			}
		}
		if (!flag && null != clazz.getSuperclass()) {
			return isImplementsOf(clazz.getSuperclass(), szInterface);
		}
		return flag;
	}
	
	/**
	* 使用 Map按value进行排序
	* @param map
	* @return
	*/
	public static Map<String, Integer> sortMapByValue(Map<String, Integer> oriMap) {
		if (oriMap == null || oriMap.isEmpty()) {
			return null;
		}
		Map<String, Integer> sortedMap = new LinkedHashMap<String, Integer>();
		List<Map.Entry<String, Integer>> entryList = new ArrayList<Map.Entry<String, Integer>>(
				oriMap.entrySet());
		// 降序排列
		Collections.sort(entryList, new Comparator<Map.Entry<String, Integer>>() {
			@Override
			public int compare(Entry<String, Integer> o1, Entry<String, Integer> o2) {
				return -(o1.getValue() - o2.getValue());
			}
		});
		for (Map.Entry<String, Integer> entry : entryList) {
			sortedMap.put(entry.getKey(), entry.getValue());
		}
		int temp =0;
		for (Map.Entry<String, Integer> entry : entryList) {
			temp++;
			if(temp <= 100){
				sortedMap.put(entry.getKey(), entry.getValue());
			}
		}
		return sortedMap;
	}
	
}
