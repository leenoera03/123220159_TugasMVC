/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Model.Dosen;

/**
 *
 * @author DELL
 */

import java.util.List;

public interface InterfaceDAODosen {
    public void insert(ModelDosen dosen);
    public void update(ModelDosen dosen);
    public void delete(int id);
    public List<ModelDosen> getAll();
}

