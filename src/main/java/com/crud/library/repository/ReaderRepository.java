package com.crud.library.repository;

import com.crud.library.domain.Book;
import com.crud.library.domain.Reader;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.List;

@Repository
@Transactional
public interface ReaderRepository extends CrudRepository<Reader, Long> {

    Reader findByNameAndSurname(String name, String surname);

    @Override
    List<Reader> findAll();
}
