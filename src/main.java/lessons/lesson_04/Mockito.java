package main.java.lessons.lesson_04;

import java.util.LinkedList;
import java.util.List;

import static org.mockito.Mockito.*;

public class Mockito {
    public static void main(String[] args) {

        List mockedList = mock(List.class);

        mockedList.add("one");
        System.out.println(mockedList.get(0));
        mockedList.clear();

        // создание mock-объектов
        List mockedList1 = mock(List.class);

        // задание условий вызова
        LinkedList mockedLinkedList1 = mock(LinkedList. class);
        when(mockedLinkedList1.get( 0)).thenReturn( "nullValue" );
        System.out.println(mockedLinkedList1.get(0)); // Выведет "nullValue"

        LinkedList mockedLinkedList2 = mock(LinkedList. class);
        when(mockedLinkedList2.get( 1)).thenThrow(new RuntimeException());
        System.out.println(mockedLinkedList2.get(1)); // Вернет исключение runtime exception

        // слежение за вызовами методов
        LinkedList mockedLinkedList = mock(LinkedList.class);
        when(mockedLinkedList.get(0)).thenReturn("nullValue");
        when(mockedLinkedList.get(1)).thenThrow(new RuntimeException());
        System.out.println(mockedLinkedList.get(0)); // Выведет "nullValue"
        System.out.println(mockedLinkedList.get(1)); // Вернет исключение runtime exception
        verify(mockedLinkedList).get(0); // Если mockedLinkedList.get(0) не будет вызван до этой проверки, то тест провалится

        /*
        when(mock.someMethod()).thenCallRealMethod(); // Вызов реальных методов
        verify(mock, timeout(100)).someMethod(); // Проверка с таймаутом
        verify(mockedList, times(2)).add("twice"); // Проверка точного количества вызовов
        verify(mockedList, never()).add("never happened");
        */
    }
}
