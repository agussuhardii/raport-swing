/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tonewbie.siibtidaiyah.dao.tablemodel;

import com.tonewbie.siibtidaiyah.model.PelajaranModel;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author agus
 */
public class PelajaranTableModel extends AbstractTableModel{
    List<PelajaranModel> list = new ArrayList<>();
    private final String[] header = {};

    public PelajaranTableModel(List<PelajaranModel> l) {
        this.list = l;
    }
    
    
    
    @Override
    public String getColumnName(int ColumnIndex){
        return header[ColumnIndex];
    }

    @Override
    public int getRowCount() {
        return list.size();
    }

    @Override
    public int getColumnCount() {
        return header.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        PelajaranModel m = list.get(rowIndex);
        switch(columnIndex){
            case 0 : return m.getIdPelajaran();
            case 1 : return m.getNamaPelajaran();
            case 2 : return m.getIdPelajaran();
            default: return null;
        }
    }
    
    
    
}
