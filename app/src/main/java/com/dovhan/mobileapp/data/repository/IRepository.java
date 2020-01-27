package com.dovhan.mobileapp.data.repository;

import java.util.List;

public interface IRepository<T> {
    List<T> getList();

    void create(T item);
}
