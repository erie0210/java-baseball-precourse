package baseball;

import constant.SystemMessage;

import java.util.List;

public class BaseballGame {
    private static int playingStatus = 1;
    private static Player player = new Player();
    private static Computer computer = new Computer();

    public static void run(){
        while(true){
            List<Integer> numberList = computer.generateNumbers();
            play(player, numberList);
            playingStatus = player.isContinue();
            if(playingStatus==2){
                break;
            }
        }
    };

    public static void play(Player player, List<Integer> generateNumbers){
        List<Integer> inputList = player.getUserInput();
        int[] compareResult = compare(inputList, generateNumbers);
        String result = getResult(compareResult[0], compareResult[1]);
        System.out.println(result);
        if(result.equals(SystemMessage.THREE_STRIKE)){
            System.out.println(SystemMessage.ALL_STRIKE);
            return;
        }
        play(player, generateNumbers);
        return;
    };

    public static int[] compare(List<Integer> inputString, List<Integer> generateNumber){
        int[] inputArray = Utils.makeStringToArray(inputString);
        int[] generateArray = Utils.makeStringToArray(generateNumber);
        return Utils.compareTwoArray(inputArray, generateArray);
    };

    private static String getResult(int strikes, int balls){
        if(strikes==0 && balls==0){
            return (SystemMessage.NOTHING);
        }
        if(balls==0){
            return (strikes + SystemMessage.STRIKE);
        }
        if(strikes==0){
            return (balls + SystemMessage.BALL);
        }
        return (balls+SystemMessage.BALL+' '+strikes+ SystemMessage.STRIKE);
    };
}
