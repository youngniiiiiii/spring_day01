package com.kbstar.frame;

import java.util.List;

public interface MyService<K, V> {
    public void register(V v);

    public void remove(K k);

    public V get(V v);

    public List<V> get();

}
