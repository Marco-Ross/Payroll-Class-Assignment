package com.marco.assignment.Services;

public interface ServiceGI<T, ID> {
    T create(T t);
    T update(T t);
    void delete(ID id);
    T read(ID id);
}
