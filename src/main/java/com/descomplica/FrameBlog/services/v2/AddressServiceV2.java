package com.descomplica.FrameBlog.services.v2;

import com.descomplica.FrameBlog.models.v2.AddressV2;

import java.util.List;

public interface AddressServiceV2 {

    AddressV2 save (final AddressV2 adressV2);

    List<AddressV2> getAll();

    AddressV2 get(final Long id);
    AddressV2 update(final Long id, final AddressV2 adressV2);
    void delete(final Long id);
}
