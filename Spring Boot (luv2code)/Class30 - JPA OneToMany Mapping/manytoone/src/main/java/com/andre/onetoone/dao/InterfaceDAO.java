package com.andre.onetoone.dao;

public interface InterfaceDAO<T> {
    void save(T obj);
    void deleteById(Integer id);
    void update(T obj);
    T findById(Integer id);
    public void updateIncrements();
}
