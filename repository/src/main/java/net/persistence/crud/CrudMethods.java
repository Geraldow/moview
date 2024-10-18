package net.persistence.crud;

import java.util.List;

public interface CrudMethods<T, ID>{
    // Implement CRUD operations here
    // For example:

    // Create
    T createObject(T entity);

    // Read
    T searchObjectById(ID id);

    // Read all
    List<T> searchAllObjects();

    // Update
    T updateObject(T entity);

    // Delete
    void deleteObjectById(ID id);
}
