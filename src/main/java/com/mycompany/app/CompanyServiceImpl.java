package com.mycompany.app;

import ro.fortsoft.dada.core.InMemoryEntityDao;
import ro.fortsoft.dada.core.service.BaseEntityService;

import java.util.List;

/**
 * @author Decebal Suiu
 */
public class CompanyServiceImpl extends BaseEntityService<Company> implements CompanyService {

    public CompanyServiceImpl(List<Company> companies) {
        super(new InMemoryEntityDao<>(companies));
    }

}
