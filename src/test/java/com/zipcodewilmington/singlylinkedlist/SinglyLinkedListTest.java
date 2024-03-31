package com.zipcodewilmington.singlylinkedlist;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
/**
 * Created by leon on 1/10/18.
 */
public class SinglyLinkedListTest {
    private SinglyLinkedList list;


@Before
public void setup() {
    list = new SinglyLinkedList();
    list.add(23);
    list.add(33);
    list.add(43);
}
    @Test
public void addTest(){

    Assert.assertEquals(3,list.size());

}
@Test
public void removeTest(){
list.remove(2);
Assert.assertEquals(2,list.size());
Assert.assertFalse(list.contains(43));
}
@Test
    public void containsTest(){
    Assert.assertTrue(list.contains(23));
    Assert.assertFalse(list.contains(11));

}
@Test
    public void findTest(){
    Assert.assertEquals(0,list.find(23));
}
@Test
    public void sizetest(){
    Assert.assertEquals(3,list.size());
}
@Test
    public void getTest(){
    Assert.assertEquals(23,list.get(0));
}
@Test
    public void copyTest(){
    SinglyLinkedList copyList=list.copy();
    Assert.assertEquals(list.size(),copyList.size());
    Assert.assertEquals(list.get(2),copyList.get(2));
}
@Test
    public void sortTest(){
    list.sort();
    Assert.assertEquals(23,list.get(0));
    Assert.assertEquals(33,list.get(1));
}



}


