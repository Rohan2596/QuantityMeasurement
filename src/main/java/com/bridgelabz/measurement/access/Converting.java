package com.bridgelabz.measurement.access;

public class Converting {

    public enum UnitConversed{
        FEET {
            public double convertToInches(double value) {
                return value * 12;
            }
        },
        INCH {
            public double convertToInches(double value) {

                return value;
            }
        },
        CENTIMETER{
            public double convertToInches(double value){
                return Math.floor(value / 2);
            }
        },
        YARD {
            public double convertToInches(double value) {
                return value * 3 * 12;
            }


        },
        LITRE{
            public double covertToLitres(double value){
                return value;
            }
        },
        MILLILITRE {
            public double covertTomilliLItres(double value){
                return value*1000;
            }
        },
        GALLON{
            public double covertToGallon(double value){
                return value*3.78;
            }

        },
        KILOGRAM{
            public double covertToGallon(double value){
                return value;
            }
        },
        GRAM{
            public double covertToGallon(double value){
                return value*1000;
            }
        },
        TONS{
            public double covertToGallon(double value){
                return value*10000;
            }
        },
        CELIUS{
            public double covertToGallon(double value){
                return (5/9)*(value -32);
            }
        },
        FAHRAHEIT{
            public double covertToGallon(double value){
                return 212;
            }
        };


        public double convertToInches(double value)
        {return 0.0;}



    }
}
