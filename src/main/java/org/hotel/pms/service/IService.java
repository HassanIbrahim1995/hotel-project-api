package org.hotel.pms.service;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface IService<D> {
    D findOneById(long id);

    Page<D> findAllSorted(Pageable pageable);

    D updateOne(long id, D d);

    D saveOne(D d);

    void deleteOne(long id);
}
