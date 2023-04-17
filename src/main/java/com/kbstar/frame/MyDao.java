package com.kbstar.frame;

import java.util.List;

public interface MyDao<K, V> {
    public void insert(V v);

    public void delete(K k);

    public V get(K k);

    public List<V> get();

}
