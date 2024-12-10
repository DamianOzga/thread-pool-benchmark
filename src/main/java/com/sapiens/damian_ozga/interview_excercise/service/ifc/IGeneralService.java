package com.sapiens.damian_ozga.interview_excercise.service.ifc;

import java.util.List;

public interface IGeneralService<T, ID> {

    void save(T entity);

    T getById(ID entityId);

    List<T> getAll();
}
