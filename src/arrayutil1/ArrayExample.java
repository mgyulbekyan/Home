package arrayutil1;

public class ArrayExample {

    //  իրա main մեթոդով, main-մեջ ունեցեք 10 էլեմենտանի ցանկացած թվերից կախված զանգված ու գրում ենք հետևյալ խնդիրները։
//        Ունենք թիվ, օրինակ՝ int x = 44; ներքևում պետք է գրենք կոդ, որը
//        մեզ կտպի true եթե նշված թիվը կա վերևի մասիվի մեջ, եթե չկա false:

//        Ունենք թիվ, օրինակ՝ int x = 44; ներքևում պետք է գրենք կոդ, որը մեզ կտպի 44 թվի ինդեքսը մասիվի մեջ եթե կա, եթե չկա -1 կտպի։
//        Ունենք թիվ, օրինակ՝ int index = 4; ներքևում պետք է գրենք կոդ, որը կտպի տրված index - ինդեքսի մեջի արժեքը։
//        Գրեք կոդ, որը կգտնի մասիվի մեջի կրկնվող էլեմենտները, ու կտպի որ օրինակ 3-ը կրկնվում է։
//        Սորտավորենք մեր ունեցած մասիվը մեծից փոքր։
//        Սորտավորենք մեր ունեցած մասիվը փոքրից մեծ։






        public static void main(String[] args) {


            int[] array = {25, 43, 43, 44, 25, 2, 25, 1, 45, 25, 12, 3};

            //        Ունենք թիվ, օրինակ՝ int x = 44;
            //        ներքևում պետք է գրենք կոդ, որը մեզ կտպի true եթե նշված թիվը կա վերևի մասիվի մեջ, եթե չկա false:
//
//        int x = 14;
//        boolean b = false;
//        boolean b1 = true;
//        for (int i = 0; i < array.length; i++) {
//            if (array[i] == x) {
//                x = array[i];
//            }
//            if (array[i] != x) {
//            }
//        }
//        System.out.println(b | b1);


            //        Ունենք թիվ, օրինակ՝ int x = 44;
            //        ներքևում պետք է գրենք կոդ, որը մեզ կտպի 44
            //        թվի ինդեքսը մասիվի մեջ եթե կա, եթե չկա -1 կտպի։
//
//        int index = 44;
//
//        for (int i = 0; i < array.length; i++) {
//            if (array[i] == index) {
//                System.out.println(array);
//
//            }
//        }


//        Ունենք թիվ, օրինակ՝ int index = 4;
//        ներքևում պետք է գրենք կոդ, որը կտպի տրված index - ինդեքսի մեջի արժեքը։
//
//        int ind = 5;
//        for (int i = 0; i < array.length; i++) {
//
//      if (array[ind] == array[i]){
//
//            }
//        }
//        System.out.print(array[ind]);


///Գրեք կոդ, որը կգտնի մասիվի մեջի կրկնվող էլեմենտները, ու կտպի որ օրինակ 3-ը կրկնվում է։

//
//        int dub=array[0];
//        for (int i = 0; i <array.length ; i++) {
//
//            if (array[i]==dub){
//                System.out.println("կրկնվող"+ " "+dub);
//
//            }
//
//        }
//

            //     Սորտավորենք մեր ունեցած մասիվը փոքրից մեծ։


            for (int i = array.length - 1; i > 0; i--) {
                for (int j = 0; j < i; j++) {
                    if (array[j] > array[i]) {
                        int sortMinOrMax = array[i];
                        array[i] = sortMinOrMax;
                        array[i] = array[j];
                        array[j] = sortMinOrMax;
                    }
                }
            }
            for (int i = 0; i < array.length; i++) {
                System.out.println("sortMinOrMax " + " " + array[i]);
            }

            //      Սորտավորենք մեր ունեցած մասիվը մեծից փոքր։


            for (int i = array.length - 1; i > 0; i--) {
                for (int j = 0; j < i; j++) {
                    if (array[j] > array[i]) {
                        int sortMaxOrMin = array[i];
                        array[i] = sortMaxOrMin;
                        array[i] = array[j];
                        array[j] = sortMaxOrMin;
                    }
                }
            }
            for (int i = array.length - 1; i >= 0; i--) {
                System.out.println("sortMaxOrMin" + " " + array[i]);
            }

        }

    }


