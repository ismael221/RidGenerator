package org.example;

import java.security.SecureRandom;

public class Main {
    public static void main(String[] args) {

        ResourceIdCodeGenerator vcg = new ResourceIdCodeGenerator();
        System.out.println("ID gerado: "+vcg.generateRid());
    }
}

class ResourceIdCodeGenerator {
    private static final char[] CHARACTERS =
            {
             '0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F','G','H','I','J','H',
             'L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z','a','b','c','d','e','f',
             'g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'
            };

    private static final int CODE_LENGTH = 48;
    private static final SecureRandom random = new SecureRandom();

    public String generateRid() {
        StringBuilder code = new StringBuilder(CODE_LENGTH);
        for (int i = 0; i < CODE_LENGTH; i++) {
            code.append(CHARACTERS[(random.nextInt(CHARACTERS.length))]);
        }
        return code.toString();
    }
}