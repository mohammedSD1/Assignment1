/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import java.io.IOException;

/**
 *
 * @author Mohammed
 */
public class ViewManger {

    public static LoginPage loginPage;
    public static CurrencyConverstionPage currencyConverstionPage;

    private ViewManger() {
    }

    public static void openLoginPage() throws IOException {
        if (loginPage == null) {
            loginPage = new LoginPage();
            loginPage.show();
        } else {
            loginPage.show();
        }
    }

    public static void opencurrencyConverstionPage() throws IOException {
        if (currencyConverstionPage == null) {
            currencyConverstionPage = new CurrencyConverstionPage();
            currencyConverstionPage.show();
        } else {
            currencyConverstionPage.show();
        }
    }

    public static void closeLoginPage() throws IOException {
        if (loginPage != null) {
            loginPage.close();
        }

    }

    public static void closecurrencyConverstionPage() throws IOException {
        if (currencyConverstionPage != null) {
            currencyConverstionPage.close();
        }

    }
}
