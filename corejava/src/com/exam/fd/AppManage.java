package com.exam.fd;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class AppManage {

	/** 
	 * @Title: getPaths 
	 * @Description: 获取拆分文件写出路径
	 * @param fileUrl 临时文件存放文件夹路径
	 * @return
	 * @throws IOException 参数说明
	 * @return String[]    返回类型
	 */
	public String[] getPaths(String fileUrl) throws IOException {
		File dir = new File(fileUrl);
		if (!dir.exists()) {
			dir.mkdirs();
		}
		String path = dir.getAbsolutePath() + File.separator + "temp";
		String[] paths = new String[160];
		String suffix = ".csv";
		File file = null;
		for (int i = 0; i < 160; i++) {
			paths[i] = path + i + suffix;
			file = new File(paths[i]);
			if (!file.exists()) {
				file.createNewFile();
			}
		}
		return paths;
	}

	/** 
	 * @Title: spliFile 
	 * @Description: 文件拆分  
	 * @param inUrl 源文件路径
	 * @param paths 拆分临时文件路径
	 * @throws IOException 参数说明
	 * @return void  返回类型
	 */
	public void spliFile(String inUrl, String[] paths) throws IOException {
		BufferedReader reader = new BufferedReader(new FileReader(inUrl));
		BufferedWriter writer0 = new BufferedWriter(new FileWriter(paths[0]));
		BufferedWriter writer1 = new BufferedWriter(new FileWriter(paths[1]));
		BufferedWriter writer2 = new BufferedWriter(new FileWriter(paths[2]));
		BufferedWriter writer3 = new BufferedWriter(new FileWriter(paths[3]));
		BufferedWriter writer4 = new BufferedWriter(new FileWriter(paths[4]));
		BufferedWriter writer5 = new BufferedWriter(new FileWriter(paths[5]));
		BufferedWriter writer6 = new BufferedWriter(new FileWriter(paths[6]));
		BufferedWriter writer7 = new BufferedWriter(new FileWriter(paths[7]));
		BufferedWriter writer8 = new BufferedWriter(new FileWriter(paths[8]));
		BufferedWriter writer9 = new BufferedWriter(new FileWriter(paths[9]));
		BufferedWriter writer10 = new BufferedWriter(new FileWriter(paths[10]));
		BufferedWriter writer11 = new BufferedWriter(new FileWriter(paths[11]));
		BufferedWriter writer12 = new BufferedWriter(new FileWriter(paths[12]));
		BufferedWriter writer13 = new BufferedWriter(new FileWriter(paths[13]));
		BufferedWriter writer14 = new BufferedWriter(new FileWriter(paths[14]));
		BufferedWriter writer15 = new BufferedWriter(new FileWriter(paths[15]));
		BufferedWriter writer16 = new BufferedWriter(new FileWriter(paths[16]));
		BufferedWriter writer17 = new BufferedWriter(new FileWriter(paths[17]));
		BufferedWriter writer18 = new BufferedWriter(new FileWriter(paths[18]));
		BufferedWriter writer19 = new BufferedWriter(new FileWriter(paths[19]));
		BufferedWriter writer20 = new BufferedWriter(new FileWriter(paths[20]));
		BufferedWriter writer21 = new BufferedWriter(new FileWriter(paths[21]));
		BufferedWriter writer22 = new BufferedWriter(new FileWriter(paths[22]));
		BufferedWriter writer23 = new BufferedWriter(new FileWriter(paths[23]));
		BufferedWriter writer24 = new BufferedWriter(new FileWriter(paths[24]));
		BufferedWriter writer25 = new BufferedWriter(new FileWriter(paths[25]));
		BufferedWriter writer26 = new BufferedWriter(new FileWriter(paths[26]));
		BufferedWriter writer27 = new BufferedWriter(new FileWriter(paths[27]));
		BufferedWriter writer28 = new BufferedWriter(new FileWriter(paths[28]));
		BufferedWriter writer29 = new BufferedWriter(new FileWriter(paths[29]));
		BufferedWriter writer30 = new BufferedWriter(new FileWriter(paths[30]));
		BufferedWriter writer31 = new BufferedWriter(new FileWriter(paths[31]));
		BufferedWriter writer32 = new BufferedWriter(new FileWriter(paths[32]));
		BufferedWriter writer33 = new BufferedWriter(new FileWriter(paths[33]));
		BufferedWriter writer34 = new BufferedWriter(new FileWriter(paths[34]));
		BufferedWriter writer35 = new BufferedWriter(new FileWriter(paths[35]));
		BufferedWriter writer36 = new BufferedWriter(new FileWriter(paths[36]));
		BufferedWriter writer37 = new BufferedWriter(new FileWriter(paths[37]));
		BufferedWriter writer38 = new BufferedWriter(new FileWriter(paths[38]));
		BufferedWriter writer39 = new BufferedWriter(new FileWriter(paths[39]));
		BufferedWriter writer40 = new BufferedWriter(new FileWriter(paths[40]));
		BufferedWriter writer41 = new BufferedWriter(new FileWriter(paths[41]));
		BufferedWriter writer42 = new BufferedWriter(new FileWriter(paths[42]));
		BufferedWriter writer43 = new BufferedWriter(new FileWriter(paths[43]));
		BufferedWriter writer44 = new BufferedWriter(new FileWriter(paths[44]));
		BufferedWriter writer45 = new BufferedWriter(new FileWriter(paths[45]));
		BufferedWriter writer46 = new BufferedWriter(new FileWriter(paths[46]));
		BufferedWriter writer47 = new BufferedWriter(new FileWriter(paths[47]));
		BufferedWriter writer48 = new BufferedWriter(new FileWriter(paths[48]));
		BufferedWriter writer49 = new BufferedWriter(new FileWriter(paths[49]));
		BufferedWriter writer50 = new BufferedWriter(new FileWriter(paths[50]));
		BufferedWriter writer51 = new BufferedWriter(new FileWriter(paths[51]));
		BufferedWriter writer52 = new BufferedWriter(new FileWriter(paths[52]));
		BufferedWriter writer53 = new BufferedWriter(new FileWriter(paths[53]));
		BufferedWriter writer54 = new BufferedWriter(new FileWriter(paths[54]));
		BufferedWriter writer55 = new BufferedWriter(new FileWriter(paths[55]));
		BufferedWriter writer56 = new BufferedWriter(new FileWriter(paths[56]));
		BufferedWriter writer57 = new BufferedWriter(new FileWriter(paths[57]));
		BufferedWriter writer58 = new BufferedWriter(new FileWriter(paths[58]));
		BufferedWriter writer59 = new BufferedWriter(new FileWriter(paths[59]));
		BufferedWriter writer60 = new BufferedWriter(new FileWriter(paths[60]));
		BufferedWriter writer61 = new BufferedWriter(new FileWriter(paths[61]));
		BufferedWriter writer62 = new BufferedWriter(new FileWriter(paths[62]));
		BufferedWriter writer63 = new BufferedWriter(new FileWriter(paths[63]));
		BufferedWriter writer64 = new BufferedWriter(new FileWriter(paths[64]));
		BufferedWriter writer65 = new BufferedWriter(new FileWriter(paths[65]));
		BufferedWriter writer66 = new BufferedWriter(new FileWriter(paths[66]));
		BufferedWriter writer67 = new BufferedWriter(new FileWriter(paths[67]));
		BufferedWriter writer68 = new BufferedWriter(new FileWriter(paths[68]));
		BufferedWriter writer69 = new BufferedWriter(new FileWriter(paths[69]));
		BufferedWriter writer70 = new BufferedWriter(new FileWriter(paths[70]));
		BufferedWriter writer71 = new BufferedWriter(new FileWriter(paths[71]));
		BufferedWriter writer72 = new BufferedWriter(new FileWriter(paths[72]));
		BufferedWriter writer73 = new BufferedWriter(new FileWriter(paths[73]));
		BufferedWriter writer74 = new BufferedWriter(new FileWriter(paths[74]));
		BufferedWriter writer75 = new BufferedWriter(new FileWriter(paths[75]));
		BufferedWriter writer76 = new BufferedWriter(new FileWriter(paths[76]));
		BufferedWriter writer77 = new BufferedWriter(new FileWriter(paths[77]));
		BufferedWriter writer78 = new BufferedWriter(new FileWriter(paths[78]));
		BufferedWriter writer79 = new BufferedWriter(new FileWriter(paths[79]));
		BufferedWriter writer80 = new BufferedWriter(new FileWriter(paths[80]));
		BufferedWriter writer81 = new BufferedWriter(new FileWriter(paths[81]));
		BufferedWriter writer82 = new BufferedWriter(new FileWriter(paths[82]));
		BufferedWriter writer83 = new BufferedWriter(new FileWriter(paths[83]));
		BufferedWriter writer84 = new BufferedWriter(new FileWriter(paths[84]));
		BufferedWriter writer85 = new BufferedWriter(new FileWriter(paths[85]));
		BufferedWriter writer86 = new BufferedWriter(new FileWriter(paths[86]));
		BufferedWriter writer87 = new BufferedWriter(new FileWriter(paths[87]));
		BufferedWriter writer88 = new BufferedWriter(new FileWriter(paths[88]));
		BufferedWriter writer89 = new BufferedWriter(new FileWriter(paths[89]));
		BufferedWriter writer90 = new BufferedWriter(new FileWriter(paths[90]));
		BufferedWriter writer91 = new BufferedWriter(new FileWriter(paths[91]));
		BufferedWriter writer92 = new BufferedWriter(new FileWriter(paths[92]));
		BufferedWriter writer93 = new BufferedWriter(new FileWriter(paths[93]));
		BufferedWriter writer94 = new BufferedWriter(new FileWriter(paths[94]));
		BufferedWriter writer95 = new BufferedWriter(new FileWriter(paths[95]));
		BufferedWriter writer96 = new BufferedWriter(new FileWriter(paths[96]));
		BufferedWriter writer97 = new BufferedWriter(new FileWriter(paths[97]));
		BufferedWriter writer98 = new BufferedWriter(new FileWriter(paths[98]));
		BufferedWriter writer99 = new BufferedWriter(new FileWriter(paths[99]));
		BufferedWriter writer100 = new BufferedWriter(new FileWriter(paths[100]));
		BufferedWriter writer101 = new BufferedWriter(new FileWriter(paths[101]));
		BufferedWriter writer102 = new BufferedWriter(new FileWriter(paths[102]));
		BufferedWriter writer103 = new BufferedWriter(new FileWriter(paths[103]));
		BufferedWriter writer104 = new BufferedWriter(new FileWriter(paths[104]));
		BufferedWriter writer105 = new BufferedWriter(new FileWriter(paths[105]));
		BufferedWriter writer106 = new BufferedWriter(new FileWriter(paths[106]));
		BufferedWriter writer107 = new BufferedWriter(new FileWriter(paths[107]));
		BufferedWriter writer108 = new BufferedWriter(new FileWriter(paths[108]));
		BufferedWriter writer109 = new BufferedWriter(new FileWriter(paths[109]));
		BufferedWriter writer110 = new BufferedWriter(new FileWriter(paths[110]));
		BufferedWriter writer111 = new BufferedWriter(new FileWriter(paths[111]));
		BufferedWriter writer112 = new BufferedWriter(new FileWriter(paths[112]));
		BufferedWriter writer113 = new BufferedWriter(new FileWriter(paths[113]));
		BufferedWriter writer114 = new BufferedWriter(new FileWriter(paths[114]));
		BufferedWriter writer115 = new BufferedWriter(new FileWriter(paths[115]));
		BufferedWriter writer116 = new BufferedWriter(new FileWriter(paths[116]));
		BufferedWriter writer117 = new BufferedWriter(new FileWriter(paths[117]));
		BufferedWriter writer118 = new BufferedWriter(new FileWriter(paths[118]));
		BufferedWriter writer119 = new BufferedWriter(new FileWriter(paths[119]));
		BufferedWriter writer120 = new BufferedWriter(new FileWriter(paths[120]));
		BufferedWriter writer121 = new BufferedWriter(new FileWriter(paths[121]));
		BufferedWriter writer122 = new BufferedWriter(new FileWriter(paths[122]));
		BufferedWriter writer123 = new BufferedWriter(new FileWriter(paths[123]));
		BufferedWriter writer124 = new BufferedWriter(new FileWriter(paths[124]));
		BufferedWriter writer125 = new BufferedWriter(new FileWriter(paths[125]));
		BufferedWriter writer126 = new BufferedWriter(new FileWriter(paths[126]));
		BufferedWriter writer127 = new BufferedWriter(new FileWriter(paths[127]));
		BufferedWriter writer128 = new BufferedWriter(new FileWriter(paths[128]));
		BufferedWriter writer129 = new BufferedWriter(new FileWriter(paths[129]));
		BufferedWriter writer130 = new BufferedWriter(new FileWriter(paths[130]));
		BufferedWriter writer131 = new BufferedWriter(new FileWriter(paths[131]));
		BufferedWriter writer132 = new BufferedWriter(new FileWriter(paths[132]));
		BufferedWriter writer133 = new BufferedWriter(new FileWriter(paths[133]));
		BufferedWriter writer134 = new BufferedWriter(new FileWriter(paths[134]));
		BufferedWriter writer135 = new BufferedWriter(new FileWriter(paths[135]));
		BufferedWriter writer136 = new BufferedWriter(new FileWriter(paths[136]));
		BufferedWriter writer137 = new BufferedWriter(new FileWriter(paths[137]));
		BufferedWriter writer138 = new BufferedWriter(new FileWriter(paths[138]));
		BufferedWriter writer139 = new BufferedWriter(new FileWriter(paths[139]));
		BufferedWriter writer140 = new BufferedWriter(new FileWriter(paths[140]));
		BufferedWriter writer141 = new BufferedWriter(new FileWriter(paths[141]));
		BufferedWriter writer142 = new BufferedWriter(new FileWriter(paths[142]));
		BufferedWriter writer143 = new BufferedWriter(new FileWriter(paths[143]));
		BufferedWriter writer144 = new BufferedWriter(new FileWriter(paths[144]));
		BufferedWriter writer145 = new BufferedWriter(new FileWriter(paths[145]));
		BufferedWriter writer146 = new BufferedWriter(new FileWriter(paths[146]));
		BufferedWriter writer147 = new BufferedWriter(new FileWriter(paths[147]));
		BufferedWriter writer148 = new BufferedWriter(new FileWriter(paths[148]));
		BufferedWriter writer149 = new BufferedWriter(new FileWriter(paths[149]));
		BufferedWriter writer150 = new BufferedWriter(new FileWriter(paths[150]));
		BufferedWriter writer151 = new BufferedWriter(new FileWriter(paths[151]));
		BufferedWriter writer152 = new BufferedWriter(new FileWriter(paths[152]));
		BufferedWriter writer153 = new BufferedWriter(new FileWriter(paths[153]));
		BufferedWriter writer154 = new BufferedWriter(new FileWriter(paths[154]));
		BufferedWriter writer155 = new BufferedWriter(new FileWriter(paths[155]));
		BufferedWriter writer156 = new BufferedWriter(new FileWriter(paths[156]));
		BufferedWriter writer157 = new BufferedWriter(new FileWriter(paths[157]));
		BufferedWriter writer158 = new BufferedWriter(new FileWriter(paths[158]));
		BufferedWriter writer159 = new BufferedWriter(new FileWriter(paths[159]));
		String line = null;
		while ((line = reader.readLine()) != null) {
			// CSV格式文件为逗号分隔符文件，这里根据逗号切分
			String item[] = line.split(",");
			int score = Integer.parseInt(item[1]);
			int part = score / 6250;
			switch (part) {
			case 0: {
				writer0.write(line);
				writer0.newLine();
				writer0.flush();
				break;
			}
			case 1: {
				writer1.write(line);
				writer1.newLine();
				writer1.flush();
				break;
			}
			case 2: {
				writer2.write(line);
				writer2.newLine();
				writer2.flush();
				break;
			}
			case 3: {
				writer3.write(line);
				writer3.newLine();
				writer3.flush();
				break;
			}
			case 4: {
				writer4.write(line);
				writer4.newLine();
				writer4.flush();
				break;
			}
			case 5: {
				writer5.write(line);
				writer5.newLine();
				writer5.flush();
				break;
			}
			case 6: {
				writer6.write(line);
				writer6.newLine();
				writer6.flush();
				break;
			}
			case 7: {
				writer7.write(line);
				writer7.newLine();
				writer7.flush();
				break;
			}
			case 8: {
				writer8.write(line);
				writer8.newLine();
				writer8.flush();
				break;
			}
			case 9: {
				writer9.write(line);
				writer9.newLine();
				writer9.flush();
				break;
			}
			case 10: {
				writer10.write(line);
				writer10.newLine();
				writer10.flush();
				break;
			}
			case 11: {
				writer11.write(line);
				writer11.newLine();
				writer11.flush();
				break;
			}
			case 12: {
				writer12.write(line);
				writer12.newLine();
				writer12.flush();
				break;
			}
			case 13: {
				writer13.write(line);
				writer13.newLine();
				writer13.flush();
				break;
			}
			case 14: {
				writer14.write(line);
				writer14.newLine();
				writer14.flush();
				break;
			}
			case 15: {
				writer15.write(line);
				writer15.newLine();
				writer15.flush();
				break;
			}
			case 16: {
				writer16.write(line);
				writer16.newLine();
				writer16.flush();
				break;
			}
			case 17: {
				writer17.write(line);
				writer17.newLine();
				writer17.flush();
				break;
			}
			case 18: {
				writer18.write(line);
				writer18.newLine();
				writer18.flush();
				break;
			}
			case 19: {
				writer19.write(line);
				writer19.newLine();
				writer19.flush();
				break;
			}
			case 20: {
				writer20.write(line);
				writer20.newLine();
				writer20.flush();
				break;
			}
			case 21: {
				writer21.write(line);
				writer21.newLine();
				writer21.flush();
				break;
			}
			case 22: {
				writer22.write(line);
				writer22.newLine();
				writer22.flush();
				break;
			}
			case 23: {
				writer23.write(line);
				writer23.newLine();
				writer23.flush();
				break;
			}
			case 24: {
				writer24.write(line);
				writer24.newLine();
				writer24.flush();
				break;
			}
			case 25: {
				writer25.write(line);
				writer25.newLine();
				writer25.flush();
				break;
			}
			case 26: {
				writer26.write(line);
				writer26.newLine();
				writer26.flush();
				break;
			}
			case 27: {
				writer27.write(line);
				writer27.newLine();
				writer27.flush();
				break;
			}
			case 28: {
				writer28.write(line);
				writer28.newLine();
				writer28.flush();
				break;
			}
			case 29: {
				writer29.write(line);
				writer29.newLine();
				writer29.flush();
				break;
			}
			case 30: {
				writer30.write(line);
				writer30.newLine();
				writer30.flush();
				break;
			}
			case 31: {
				writer31.write(line);
				writer31.newLine();
				writer31.flush();
				break;
			}
			case 32: {
				writer32.write(line);
				writer32.newLine();
				writer32.flush();
				break;
			}
			case 33: {
				writer33.write(line);
				writer33.newLine();
				writer33.flush();
				break;
			}
			case 34: {
				writer34.write(line);
				writer34.newLine();
				writer34.flush();
				break;
			}
			case 35: {
				writer35.write(line);
				writer35.newLine();
				writer35.flush();
				break;
			}
			case 36: {
				writer36.write(line);
				writer36.newLine();
				writer36.flush();
				break;
			}
			case 37: {
				writer37.write(line);
				writer37.newLine();
				writer37.flush();
				break;
			}
			case 38: {
				writer38.write(line);
				writer38.newLine();
				writer38.flush();
				break;
			}
			case 39: {
				writer39.write(line);
				writer39.newLine();
				writer39.flush();
				break;
			}
			case 40: {
				writer40.write(line);
				writer40.newLine();
				writer40.flush();
				break;
			}
			case 41: {
				writer41.write(line);
				writer41.newLine();
				writer41.flush();
				break;
			}
			case 42: {
				writer42.write(line);
				writer42.newLine();
				writer42.flush();
				break;
			}
			case 43: {
				writer43.write(line);
				writer43.newLine();
				writer43.flush();
				break;
			}
			case 44: {
				writer44.write(line);
				writer44.newLine();
				writer44.flush();
				break;
			}
			case 45: {
				writer45.write(line);
				writer45.newLine();
				writer45.flush();
				break;
			}
			case 46: {
				writer46.write(line);
				writer46.newLine();
				writer46.flush();
				break;
			}
			case 47: {
				writer47.write(line);
				writer47.newLine();
				writer47.flush();
				break;
			}
			case 48: {
				writer48.write(line);
				writer48.newLine();
				writer48.flush();
				break;
			}
			case 49: {
				writer49.write(line);
				writer49.newLine();
				writer49.flush();
				break;
			}
			case 50: {
				writer50.write(line);
				writer50.newLine();
				writer50.flush();
				break;
			}
			case 51: {
				writer51.write(line);
				writer51.newLine();
				writer51.flush();
				break;
			}
			case 52: {
				writer52.write(line);
				writer52.newLine();
				writer52.flush();
				break;
			}
			case 53: {
				writer53.write(line);
				writer53.newLine();
				writer53.flush();
				break;
			}
			case 54: {
				writer54.write(line);
				writer54.newLine();
				writer54.flush();
				break;
			}
			case 55: {
				writer55.write(line);
				writer55.newLine();
				writer55.flush();
				break;
			}
			case 56: {
				writer56.write(line);
				writer56.newLine();
				writer56.flush();
				break;
			}
			case 57: {
				writer57.write(line);
				writer57.newLine();
				writer57.flush();
				break;
			}
			case 58: {
				writer58.write(line);
				writer58.newLine();
				writer58.flush();
				break;
			}
			case 59: {
				writer59.write(line);
				writer59.newLine();
				writer59.flush();
				break;
			}
			case 60: {
				writer60.write(line);
				writer60.newLine();
				writer60.flush();
				break;
			}
			case 61: {
				writer61.write(line);
				writer61.newLine();
				writer61.flush();
				break;
			}
			case 62: {
				writer62.write(line);
				writer62.newLine();
				writer62.flush();
				break;
			}
			case 63: {
				writer63.write(line);
				writer63.newLine();
				writer63.flush();
				break;
			}
			case 64: {
				writer64.write(line);
				writer64.newLine();
				writer64.flush();
				break;
			}
			case 65: {
				writer65.write(line);
				writer65.newLine();
				writer65.flush();
				break;
			}
			case 66: {
				writer66.write(line);
				writer66.newLine();
				writer66.flush();
				break;
			}
			case 67: {
				writer67.write(line);
				writer67.newLine();
				writer67.flush();
				break;
			}
			case 68: {
				writer68.write(line);
				writer68.newLine();
				writer68.flush();
				break;
			}
			case 69: {
				writer69.write(line);
				writer69.newLine();
				writer69.flush();
				break;
			}
			case 70: {
				writer70.write(line);
				writer70.newLine();
				writer70.flush();
				break;
			}
			case 71: {
				writer71.write(line);
				writer71.newLine();
				writer71.flush();
				break;
			}
			case 72: {
				writer72.write(line);
				writer72.newLine();
				writer72.flush();
				break;
			}
			case 73: {
				writer73.write(line);
				writer73.newLine();
				writer73.flush();
				break;
			}
			case 74: {
				writer74.write(line);
				writer74.newLine();
				writer74.flush();
				break;
			}
			case 75: {
				writer75.write(line);
				writer75.newLine();
				writer75.flush();
				break;
			}
			case 76: {
				writer76.write(line);
				writer76.newLine();
				writer76.flush();
				break;
			}
			case 77: {
				writer77.write(line);
				writer77.newLine();
				writer77.flush();
				break;
			}
			case 78: {
				writer78.write(line);
				writer78.newLine();
				writer78.flush();
				break;
			}
			case 79: {
				writer79.write(line);
				writer79.newLine();
				writer79.flush();
				break;
			}
			case 80: {
				writer80.write(line);
				writer80.newLine();
				writer80.flush();
				break;
			}
			case 81: {
				writer81.write(line);
				writer81.newLine();
				writer81.flush();
				break;
			}
			case 82: {
				writer82.write(line);
				writer82.newLine();
				writer82.flush();
				break;
			}
			case 83: {
				writer83.write(line);
				writer83.newLine();
				writer83.flush();
				break;
			}
			case 84: {
				writer84.write(line);
				writer84.newLine();
				writer84.flush();
				break;
			}
			case 85: {
				writer85.write(line);
				writer85.newLine();
				writer85.flush();
				break;
			}
			case 86: {
				writer86.write(line);
				writer86.newLine();
				writer86.flush();
				break;
			}
			case 87: {
				writer87.write(line);
				writer87.newLine();
				writer87.flush();
				break;
			}
			case 88: {
				writer88.write(line);
				writer88.newLine();
				writer88.flush();
				break;
			}
			case 89: {
				writer89.write(line);
				writer89.newLine();
				writer89.flush();
				break;
			}
			case 90: {
				writer90.write(line);
				writer90.newLine();
				writer90.flush();
				break;
			}
			case 91: {
				writer91.write(line);
				writer91.newLine();
				writer91.flush();
				break;
			}
			case 92: {
				writer92.write(line);
				writer92.newLine();
				writer92.flush();
				break;
			}
			case 93: {
				writer93.write(line);
				writer93.newLine();
				writer93.flush();
				break;
			}
			case 94: {
				writer94.write(line);
				writer94.newLine();
				writer94.flush();
				break;
			}
			case 95: {
				writer95.write(line);
				writer95.newLine();
				writer95.flush();
				break;
			}
			case 96: {
				writer96.write(line);
				writer96.newLine();
				writer96.flush();
				break;
			}
			case 97: {
				writer97.write(line);
				writer97.newLine();
				writer97.flush();
				break;
			}
			case 98: {
				writer98.write(line);
				writer98.newLine();
				writer98.flush();
				break;
			}
			case 99: {
				writer99.write(line);
				writer99.newLine();
				writer99.flush();
				break;
			}
			case 100: {
				writer100.write(line);
				writer100.newLine();
				writer100.flush();
				break;
			}
			case 101: {
				writer101.write(line);
				writer101.newLine();
				writer101.flush();
				break;
			}
			case 102: {
				writer102.write(line);
				writer102.newLine();
				writer102.flush();
				break;
			}
			case 103: {
				writer103.write(line);
				writer103.newLine();
				writer103.flush();
				break;
			}
			case 104: {
				writer104.write(line);
				writer104.newLine();
				writer104.flush();
				break;
			}
			case 105: {
				writer105.write(line);
				writer105.newLine();
				writer105.flush();
				break;
			}
			case 106: {
				writer106.write(line);
				writer106.newLine();
				writer106.flush();
				break;
			}
			case 107: {
				writer107.write(line);
				writer107.newLine();
				writer107.flush();
				break;
			}
			case 108: {
				writer108.write(line);
				writer108.newLine();
				writer108.flush();
				break;
			}
			case 109: {
				writer109.write(line);
				writer109.newLine();
				writer109.flush();
				break;
			}
			case 110: {
				writer110.write(line);
				writer110.newLine();
				writer110.flush();
				break;
			}
			case 111: {
				writer111.write(line);
				writer111.newLine();
				writer111.flush();
				break;
			}
			case 112: {
				writer112.write(line);
				writer112.newLine();
				writer112.flush();
				break;
			}
			case 113: {
				writer113.write(line);
				writer113.newLine();
				writer113.flush();
				break;
			}
			case 114: {
				writer114.write(line);
				writer114.newLine();
				writer114.flush();
				break;
			}
			case 115: {
				writer115.write(line);
				writer115.newLine();
				writer115.flush();
				break;
			}
			case 116: {
				writer116.write(line);
				writer116.newLine();
				writer116.flush();
				break;
			}
			case 117: {
				writer117.write(line);
				writer117.newLine();
				writer117.flush();
				break;
			}
			case 118: {
				writer118.write(line);
				writer118.newLine();
				writer118.flush();
				break;
			}
			case 119: {
				writer119.write(line);
				writer119.newLine();
				writer119.flush();
				break;
			}
			case 120: {
				writer120.write(line);
				writer120.newLine();
				writer120.flush();
				break;
			}
			case 121: {
				writer121.write(line);
				writer121.newLine();
				writer121.flush();
				break;
			}
			case 122: {
				writer122.write(line);
				writer122.newLine();
				writer122.flush();
				break;
			}
			case 123: {
				writer123.write(line);
				writer123.newLine();
				writer123.flush();
				break;
			}
			case 124: {
				writer124.write(line);
				writer124.newLine();
				writer124.flush();
				break;
			}
			case 125: {
				writer125.write(line);
				writer125.newLine();
				writer125.flush();
				break;
			}
			case 126: {
				writer126.write(line);
				writer126.newLine();
				writer126.flush();
				break;
			}
			case 127: {
				writer127.write(line);
				writer127.newLine();
				writer127.flush();
				break;
			}
			case 128: {
				writer128.write(line);
				writer128.newLine();
				writer128.flush();
				break;
			}
			case 129: {
				writer129.write(line);
				writer129.newLine();
				writer129.flush();
				break;
			}
			case 130: {
				writer130.write(line);
				writer130.newLine();
				writer130.flush();
				break;
			}
			case 131: {
				writer131.write(line);
				writer131.newLine();
				writer131.flush();
				break;
			}
			case 132: {
				writer132.write(line);
				writer132.newLine();
				writer132.flush();
				break;
			}
			case 133: {
				writer133.write(line);
				writer133.newLine();
				writer133.flush();
				break;
			}
			case 134: {
				writer134.write(line);
				writer134.newLine();
				writer134.flush();
				break;
			}
			case 135: {
				writer135.write(line);
				writer135.newLine();
				writer135.flush();
				break;
			}
			case 136: {
				writer136.write(line);
				writer136.newLine();
				writer136.flush();
				break;
			}
			case 137: {
				writer137.write(line);
				writer137.newLine();
				writer137.flush();
				break;
			}
			case 138: {
				writer138.write(line);
				writer138.newLine();
				writer138.flush();
				break;
			}
			case 139: {
				writer139.write(line);
				writer139.newLine();
				writer139.flush();
				break;
			}
			case 140: {
				writer140.write(line);
				writer140.newLine();
				writer140.flush();
				break;
			}
			case 141: {
				writer141.write(line);
				writer141.newLine();
				writer141.flush();
				break;
			}
			case 142: {
				writer142.write(line);
				writer142.newLine();
				writer142.flush();
				break;
			}
			case 143: {
				writer143.write(line);
				writer143.newLine();
				writer143.flush();
				break;
			}
			case 144: {
				writer144.write(line);
				writer144.newLine();
				writer144.flush();
				break;
			}
			case 145: {
				writer145.write(line);
				writer145.newLine();
				writer145.flush();
				break;
			}
			case 146: {
				writer146.write(line);
				writer146.newLine();
				writer146.flush();
				break;
			}
			case 147: {
				writer147.write(line);
				writer147.newLine();
				writer147.flush();
				break;
			}
			case 148: {
				writer148.write(line);
				writer148.newLine();
				writer148.flush();
				break;
			}
			case 149: {
				writer149.write(line);
				writer149.newLine();
				writer149.flush();
				break;
			}
			case 150: {
				writer150.write(line);
				writer150.newLine();
				writer150.flush();
				break;
			}
			case 151: {
				writer151.write(line);
				writer151.newLine();
				writer151.flush();
				break;
			}
			case 152: {
				writer152.write(line);
				writer152.newLine();
				writer152.flush();
				break;
			}
			case 153: {
				writer153.write(line);
				writer153.newLine();
				writer153.flush();
				break;
			}
			case 154: {
				writer154.write(line);
				writer154.newLine();
				writer154.flush();
				break;
			}
			case 155: {
				writer155.write(line);
				writer155.newLine();
				writer155.flush();
				break;
			}
			case 156: {
				writer156.write(line);
				writer156.newLine();
				writer156.flush();
				break;
			}
			case 157: {
				writer157.write(line);
				writer157.newLine();
				writer157.flush();
				break;
			}
			case 158: {
				writer158.write(line);
				writer158.newLine();
				writer158.flush();
				break;
			}
			default: {
				writer159.write(line);
				writer159.newLine();
				writer159.flush();
				break;
			}
			}
		}
		reader.close();
		writer0.close();
		writer1.close();
		writer2.close();
		writer3.close();
		writer4.close();
		writer5.close();
		writer6.close();
		writer7.close();
		writer8.close();
		writer9.close();
		writer10.close();
		writer11.close();
		writer12.close();
		writer13.close();
		writer14.close();
		writer15.close();
		writer16.close();
		writer17.close();
		writer18.close();
		writer19.close();
		writer20.close();
		writer21.close();
		writer22.close();
		writer23.close();
		writer24.close();
		writer25.close();
		writer26.close();
		writer27.close();
		writer28.close();
		writer29.close();
		writer30.close();
		writer31.close();
		writer32.close();
		writer33.close();
		writer34.close();
		writer35.close();
		writer36.close();
		writer37.close();
		writer38.close();
		writer39.close();
		writer40.close();
		writer41.close();
		writer42.close();
		writer43.close();
		writer44.close();
		writer45.close();
		writer46.close();
		writer47.close();
		writer48.close();
		writer49.close();
		writer50.close();
		writer51.close();
		writer52.close();
		writer53.close();
		writer54.close();
		writer55.close();
		writer56.close();
		writer57.close();
		writer58.close();
		writer59.close();
		writer60.close();
		writer61.close();
		writer62.close();
		writer63.close();
		writer64.close();
		writer65.close();
		writer66.close();
		writer67.close();
		writer68.close();
		writer69.close();
		writer70.close();
		writer71.close();
		writer72.close();
		writer73.close();
		writer74.close();
		writer75.close();
		writer76.close();
		writer77.close();
		writer78.close();
		writer79.close();
		writer80.close();
		writer81.close();
		writer82.close();
		writer83.close();
		writer84.close();
		writer85.close();
		writer86.close();
		writer87.close();
		writer88.close();
		writer89.close();
		writer90.close();
		writer91.close();
		writer92.close();
		writer93.close();
		writer94.close();
		writer95.close();
		writer96.close();
		writer97.close();
		writer98.close();
		writer99.close();
		writer100.close();
		writer101.close();
		writer102.close();
		writer103.close();
		writer104.close();
		writer105.close();
		writer106.close();
		writer107.close();
		writer108.close();
		writer109.close();
		writer110.close();
		writer111.close();
		writer112.close();
		writer113.close();
		writer114.close();
		writer115.close();
		writer116.close();
		writer117.close();
		writer118.close();
		writer119.close();
		writer120.close();
		writer121.close();
		writer122.close();
		writer123.close();
		writer124.close();
		writer125.close();
		writer126.close();
		writer127.close();
		writer128.close();
		writer129.close();
		writer130.close();
		writer131.close();
		writer132.close();
		writer133.close();
		writer134.close();
		writer135.close();
		writer136.close();
		writer137.close();
		writer138.close();
		writer139.close();
		writer140.close();
		writer141.close();
		writer142.close();
		writer143.close();
		writer144.close();
		writer145.close();
		writer146.close();
		writer147.close();
		writer148.close();
		writer149.close();
		writer150.close();
		writer151.close();
		writer152.close();
		writer153.close();
		writer154.close();
		writer155.close();
		writer156.close();
		writer157.close();
		writer158.close();
		writer159.close();
	}

	/** 
	 * @Title: mergeFile 
	 * @Description: 文件合并输出 
	 * @param outUrl 合并输出文件路径
	 * @param inPaths 临时文件路径
	 * @throws IOException 参数说明
	 * @return void    返回类型
	 */
	public void mergeFile(String outUrl, String[] inPaths) throws IOException {
		BufferedWriter writer = new BufferedWriter(new FileWriter(outUrl, true));
		for (String inPath : inPaths) {
			mergeFile(inPath, writer);
		}
		if (writer != null) {
			writer.close();
		}
	}
	
	/** 
	 * @Title: mergeFile 
	 * @Description: 文件合并输出
	 * @param inPath 临时文件路径
	 * @param writer
	 * @throws IOException 参数说明
	 * @return void    返回类型
	 */
	public void mergeFile(String inPath, BufferedWriter writer) throws IOException {
		List<User> list = new ArrayList();
//		List<User> list = new ArrayList<>(88);
		BufferedReader reader = new BufferedReader(new FileReader(inPath));
		String line = null;
		while ((line = reader.readLine()) != null) {
			// CSV格式文件为逗号分隔符文件，这里根据逗号切分
			String item[] = line.split(",");
			list.add(new User(item[0], Integer.parseInt(item[1])));
		}
		Collections.sort(list);
		for (User user : list) {
			writer.write(user.getUserId() + "," + user.getScore());
			writer.newLine();
			writer.flush();
		}
		if (reader != null) {
			reader.close();
		}
	}

	/** 
	 * @Title: init 
	 * @Description: 初始化 
	 * @throws IOException 参数说明
	 * @return void    返回类型
	 */
	public void init() throws IOException {
		String[] paths = getPaths("/temp");
		spliFile("/usr/user_score.csv", paths);
		mergeFile("/usr/user_score_out.csv", paths);
	}

	public static void main(String[] args) throws IOException {
		AppManage app = new AppManage();
		long start = System.currentTimeMillis();
		System.out.println("start:" + start);
		app.init();
		long end = System.currentTimeMillis();
		System.out.println("end:" + end);
		System.out.println("times:" + (end - start) / 1000);

	}

}
