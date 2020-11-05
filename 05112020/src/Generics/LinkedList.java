package Generics;

public class LinkedList<T> {
        private Elemento first;
        public LinkedList<T> next;

        private class Elemento{
            private T val;
            private Elemento next;
            public Elemento(T val, Elemento next){
                this.val = val;
                this.next = next;
            }
        }

        void addFirst(T value){
            Elemento oldFirst = first;
            Elemento newFirst= new Elemento(value, oldFirst);
            first = newFirst;
        }

        void removeFirst(){
            Elemento oldFirst = first;
            Elemento newFirst = oldFirst.next;
            first= newFirst;
        }
    }
