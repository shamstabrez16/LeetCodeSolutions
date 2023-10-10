package org.example;

public class Main {

    static float learningCoeff = 0.3f;
    static float[] targetOutputs = {1.0f, 0.0f, 0.0f, 1.0f};
    static int[][] givenInput = {{0, 0}, {0, 1}, {1, 0}, {1, 1}};
    static int numberOfInputUnits = 2;
    static int numberOfHiddenUnits = 3;
    static int numberOfOutputUnits = 1;
    static float[] netOfHiddenUnits = new float[numberOfHiddenUnits];
    static float[] outputOfHiddenUnits = new float[numberOfHiddenUnits];
    static float[] outputOfOutputUnits = new float[numberOfOutputUnits];
    static float[] deltaOfOutputUnit = new float[numberOfOutputUnits];
    static float[] deltaOfHiddenUnits = new float[numberOfHiddenUnits];

    private static final float[][] betweenInpAndHid = new float[numberOfInputUnits][numberOfHiddenUnits];
    private static final float[][] betweenHidAndOut = new float[numberOfOutputUnits][numberOfHiddenUnits];

    public static void generateBetweenInAndHidValues() {
        for (int i = 0; i < numberOfInputUnits; i++) {
            for (int j = 0; j < numberOfHiddenUnits; j++) {
                betweenInpAndHid[i][j] = (float) Math.random();
            }
        }
    }

    public static void generateBetweenHiddenAndOutputValues() {
        for (int i = 0; i < numberOfOutputUnits; i++) {
            for (int j = 0; j < numberOfHiddenUnits; j++) {
                betweenHidAndOut[i][j] = (float) Math.random();
            }
        }
    }


    public static float getLearningCoefficient() {
        if (learningCoeff == 0) {
            learningCoeff = (float) Math.random();
        }
        return learningCoeff;
    }

    public static float getSigmoid_functionValue(float x) {
        return (float) (1 / (1 + Math.pow(Math.E, (-1 * x))));
    }

    public static float[][] getBetweenInputAndHidden() {
        return betweenInpAndHid;
    }

    public static float[][] getBetweenHiddenAndOutput() {
        return betweenHidAndOut;
    }

    public static void getNetOfHiddenAndAndActualOutputOfHiddenUnit(int idx) {
        int k = idx;
        for (int i = 0; i < betweenInpAndHid[0].length; i++) {
            float netHidden = 0f;
            System.out.print("The net of hidden unit " + (i + 1) + ": ");
            for (int j = 0; j < numberOfInputUnits; j++) {

                if (j <= numberOfInputUnits && j != 0) {
                    System.out.print(" + " + givenInput[k][j] + " * " + betweenInpAndHid[j][i]);

                } else {
                    System.out.print(" " + givenInput[k][j] + " * " + betweenInpAndHid[j][i]);

                }
                netHidden = netHidden + givenInput[k][j] * betweenInpAndHid[j][i];
                System.out.println(" : " + netOfHiddenUnits[i]);

            }
            netOfHiddenUnits[i] = netHidden;
            outputOfHiddenUnits[i] = getSigmoid_functionValue(netHidden);
            System.out.println("The output of hidden unit " + (i + 1) + " is =" + outputOfHiddenUnits[i]);
        }
        System.out.println();

    }

    public static void getNetOfOutputUnitAndActualOutputOfOutputUnit(int idx) {
        int k = 0;
        for (int i = 0; i < betweenHidAndOut.length; i++) {
            float net = 0f;
            System.out.print("The net of output unit " + (i + 1) + " is ");

            for (int j = 0; j < betweenHidAndOut[k].length; j++) {
                if (j <= betweenHidAndOut[k].length && j != 0) {
                    System.out.print(" + " + betweenHidAndOut[k][j] + " * " + outputOfHiddenUnits[j]);

                } else {
                    System.out.print(betweenHidAndOut[k][j] + " * " + outputOfHiddenUnits[j]);
                }
                net = net + betweenHidAndOut[k][j] * outputOfHiddenUnits[j];
            }
            System.out.println(" = " + net);
            outputOfOutputUnits[i] = getSigmoid_functionValue(net);
            System.out.println("The output of output unit " + (i + 1) + " is =" + outputOfOutputUnits[i]);
        }
        System.out.println();
    }

    public static void getDeltaOfOutputs(int idx) {
        for (int i = 0; i < numberOfOutputUnits; i++) {
            System.out.print("The delta of output unit " + (i + 1));
            System.out.print("  (" + targetOutputs[idx] + "-" + outputOfOutputUnits[0] + ") * " + outputOfOutputUnits[0] + " * (1 - " + outputOfOutputUnits[0] + ") = ");
            deltaOfOutputUnit[i] = ((targetOutputs[idx] - outputOfOutputUnits[0]) * outputOfOutputUnits[0] * (1 - outputOfOutputUnits[0]));
            System.out.println(deltaOfOutputUnit[0]);
        }
        System.out.println();
    }

    public static void getDeltaOfHiddenUnits(int idx) {
        for (int i = 0; i < betweenHidAndOut[0].length; i++) {
            float delta = 0f;
            for (int j = 0; j < numberOfOutputUnits; j++) {
                System.out.print("The delta of hidden unit " + (i + 1) + ":  ");

                delta = delta + deltaOfOutputUnit[j] * betweenHidAndOut[j][i];
                System.out.println(deltaOfOutputUnit[j] + " * " + betweenHidAndOut[j][i]);
            }
            System.out.println(delta + "*" + outputOfHiddenUnits[i] + " * " + (1 - outputOfHiddenUnits[i]));
            delta = delta * outputOfHiddenUnits[i] * (1 - outputOfHiddenUnits[i]);
            deltaOfHiddenUnits[i] = delta;
            System.out.println(delta);
        }
        System.out.println();
    }

    public static void getNewWeightsBetweenHiddenAndOutputUnits() {
        for (int i = 0; i < betweenHidAndOut.length; i++) {
            for (int j = 0; j < betweenHidAndOut[i].length; j++) {
                float delta = betweenHidAndOut[i][j] + learningCoeff * deltaOfOutputUnit[i] * outputOfHiddenUnits[j];
                System.out.print("new weight of " + betweenHidAndOut[i][j] + " is (from hidden unit " + (i + 1) + " to output unit " + (j + 1) + ")  is ");
                System.out.print(" " + betweenHidAndOut[i][j] + " + " + learningCoeff + " * " + deltaOfOutputUnit[i] + " * " + outputOfHiddenUnits[j] + " =");
                betweenHidAndOut[i][j] = delta;
                System.out.println(delta);
            }
        }
        System.out.println();
    }

    public static void getNewWeightsBetweenInputAndHiddenUnits(int idx) {
        for (int i = 0; i < betweenInpAndHid.length; i++) {
            for (int j = 0; j < betweenInpAndHid[i].length; j++) {
                float newWeight = betweenInpAndHid[i][j] + learningCoeff * deltaOfHiddenUnits[j] * givenInput[idx][i];
                System.out.print("new weight of " + betweenInpAndHid[i][j] + " is (from input  unit " + (i + 1) + " to hidden unit " + (j + 1) + ")  :");
                System.out.println(betweenInpAndHid[i][j] + " + " + learningCoeff + " * " + deltaOfHiddenUnits[j] + " * " + givenInput[idx][i] + " = " + newWeight);
                betweenInpAndHid[i][j] = newWeight;
            }
            System.out.println();

        }
    }


    public static void main(String[] args) {
        generateBetweenInAndHidValues();
        generateBetweenHiddenAndOutputValues();
        System.out.println("Learning Coefficient: " + getLearningCoefficient());
        float[][] betweenInpAndHid = getBetweenInputAndHidden();
        float[][] betweenHidAndOutUnits = getBetweenHiddenAndOutput();
        System.out.println("printing initial weights between Input And Hidden  before training.");
        for (int i = 0; i < betweenInpAndHid.length; i++) {
            for (int j = 0; j < betweenInpAndHid[0].length; j++) {
                System.out.println(" Between Input " + (i + 1) + " and Hidden Unit " + (j + 1) + ":" + betweenInpAndHid[i][j]);
            }
        }

        System.out.println();
        System.out.println("printing initial weights between Hidden And Output Units  before training.");
        for (int i = 0; i < betweenHidAndOutUnits.length; i++) {
            for (int j = 0; j < betweenHidAndOutUnits[0].length; j++) {
                System.out.println(" Between Hidden " + (i + 1) + " and Output Unit " + (j + 1) + ":" + betweenHidAndOutUnits[i][j]);
            }
        }
        boolean flag = true;
        int isConditionMet = 1;
        int isMatched = 0;
        int epoch = 1;
        while (isConditionMet == 1) {
            int idx = 0;
            while (idx <= 3) {
                getNetOfHiddenAndAndActualOutputOfHiddenUnit(idx);
                getNetOfOutputUnitAndActualOutputOfOutputUnit(idx);
                if (targetOutputs[idx] == 1.0) {
                    if (outputOfOutputUnits[0] < 0.90) {
                        getDeltaOfOutputs(idx);
                        getDeltaOfHiddenUnits(idx);
                        getNewWeightsBetweenInputAndHiddenUnits(idx);
                        getNewWeightsBetweenHiddenAndOutputUnits();
                        isMatched = 0;
                    } else {
                        isMatched++;
                        if (isMatched == 4) {
                            isConditionMet = 0;
                        }
                    }
                } else if (targetOutputs[idx] == 0.0) {
                    if (outputOfOutputUnits[0] > 0.10) {
                        getDeltaOfOutputs(idx);
                        getDeltaOfHiddenUnits(idx);
                        getNewWeightsBetweenInputAndHiddenUnits(idx);
                        getNewWeightsBetweenHiddenAndOutputUnits();
                        isMatched = 0;
                    } else {
                        isMatched++;
                        if (isMatched == 4) {
                            isConditionMet = 0;
                        }
                    }

                }

                idx++;
            }
            epoch++;
        }
        System.out.println("EPOC " + epoch);


        int i = 0;
        while (i < betweenInpAndHid.length) {
            int j = 0;
            while (j < betweenInpAndHid[0].length) {
                System.out.println(" Between Input " + (i + 1) + " and Hidden Unit " + (j + 1) + ":" + betweenInpAndHid[i][j]);
                j++;
            }


            i++;
        }

        System.out.println();
        System.out.println("printing final weights between Hidden And Output Units  after training.");


        i = 0;
        while (i < betweenHidAndOutUnits.length) {
            int j = 0;
            while (j < betweenHidAndOutUnits[0].length) {
                System.out.println(" Between Hidden " + (i + 1) + " and Output Unit " + (j + 1) + ":" + betweenHidAndOutUnits[i][j]);
                j++;
            }


            i++;
        }

    }
}