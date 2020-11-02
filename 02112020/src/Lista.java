public interface Lista {
    abstract Object get(int i);
    abstract boolean contains(Object o);
    abstract int size();
    abstract void add(Object o);
    abstract boolean remove(int i);
    abstract void clear();
}
