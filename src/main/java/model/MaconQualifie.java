package model;

    public class MaconQualifie extends Personne {

        public MaconQualifie(String nom, String prenom) {
            super(nom, prenom, "MaconQualifie");
        }

        public MaconQualifie() {

        }

        @Override
        public String travail() {
            return "je regarde le macon :) " ;
        }

        @Override
        public String loisir() {
            return "j'aime jouer avec le macon aux Lego !";
        }
    }

