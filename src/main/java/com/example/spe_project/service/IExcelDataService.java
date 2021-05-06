package com.example.spe_project.service;

import com.example.spe_project.model.menu_data;

import java.util.List;




public interface IExcelDataService {
    List<menu_data> getExcelDataAsList();

    int saveExcelData(List<menu_data> invoices);

}
