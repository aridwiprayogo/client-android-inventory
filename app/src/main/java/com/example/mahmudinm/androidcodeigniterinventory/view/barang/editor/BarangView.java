package com.example.mahmudinm.androidcodeigniterinventory.view.barang.editor;

import com.example.mahmudinm.androidcodeigniterinventory.network.response.BarangResponse;

public interface BarangView {

    void statusSuccess(BarangResponse barangResponse);
    void statusError(String message);
    void showProgress();
    void hideProgress();

}
