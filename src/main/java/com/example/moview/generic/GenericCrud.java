package com.example.moview.generic;

import java.util.List;

public abstract class GenericCrud<T, ID>{
    // Implement CRUD operations here
    // For example:

    // Create
    public abstract T createObject(T entity);

    // Read
    public abstract T searchObjectById(ID id);

    // Read all
    public abstract List<T> searchAllObjects();

    // Update
    public abstract T updateObject(T entity);

    // Delete
    public abstract void deleteObjectById(ID id);
}
