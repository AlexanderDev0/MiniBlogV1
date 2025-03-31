package com.descomplica.FrameBlog.services.v2;

public interface AdressServiceV2 {

    AdressV2 save (final AdressV2 adressV2);

    List<AdressV2> getAll();

    AdressV2 get(final Long id);
    AdressV2 update(final Long id, final AdressV2 adressV2);
    void delete(final Long id);
}
