package com.andre.manytomany.dao;

public interface InterfaceDAO<T> {
    void save(T obj);
    void deleteById(Integer id);
    void update(T obj);
    T findById(Integer id);
    public void updateIncrements();
}
