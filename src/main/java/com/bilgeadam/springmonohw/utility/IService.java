package com.bilgeadam.springmonohw.utility;

import java.util.List;
import java.util.Optional;

public interface IService<T,ID> {
    T save (T t);
    T update(T t);
    List<T> findAll();
    Optional<T> findById(ID id);

}
