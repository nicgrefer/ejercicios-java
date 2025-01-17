package com.exceptions;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            String password = sc.nextLine();
            if (password.length() < 8) {
                throw new PasswordLengthException("La contraseña debe tener al menos 8 caracteres");
            }
            if (!password.matches(".*\\p{Upper}.*")) {
                throw new PasswordUpperCaseException("La contraseña debe tener al menos una letra mayuscula");
            }
            if (!password.matches(".*\\p{Lower}.*")) {
                throw new PasswordLowerCaseException("La contraseña debe tener al menos una letra minuscula");
            }
            if (!password.matches(".*\\d.*")) {
                throw new PasswordDigitException("La contraseña debe tener al menos un numero");
            }
            if(!password.matches(".*\\p{Sc}.*@|!?¿)(/&%&·$%~€¬")){
                throw new PasswordSimbolException("La contraseña debe de tener un simbolo");
            }
            System.out.println("Contraseña válida");
        } catch (PasswordDigitException | PasswordLengthException | PasswordLowerCaseException | PasswordSimbolException | PasswordUpperCaseException e) {
            System.err.println(e.getMessage());
        }
    }
}

