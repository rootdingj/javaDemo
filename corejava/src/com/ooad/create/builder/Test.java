package com.ooad.create.builder;

/*5.建造者模式(Builder)
 *将一个复杂对象的构建与它的表示分离
 * */
public class Test{
    
    public static void main(String[] args) {
        PersonDirector pd = new PersonDirector();
        Person person = pd.constructPerson(new ManBuilder());
        System.out.println(person.getBody());
        System.out.println(person.getFoot());
        System.out.println(person.getHead());
    }
}

