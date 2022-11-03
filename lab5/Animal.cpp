# include "Animal.h"


int main() {

    // 3.2
    cout << endl;
    Mammal mam("Mam1", Brown);
    mam.speak();

    cout << endl;
    Dog dog("Dog1", Brown, "Cong");
    dog.speak();
    dog.move();

    // 3.3
    Animal *animalPtr = new Dog("Lassie", White, "Andy"); // a pointer to dog object
    animalPtr->speak();
    animalPtr->move();
    delete animalPtr;

    Dog dogi("Lassie", White, "Andy");
    Mammal *aniPtr = &dogi ;
    Mammal &aniRef = dogi ;
    Mammal aniVal = dogi ;
    aniPtr->speak() ;  // call the Dog's method
    aniRef.speak() ;  // call the Dog's method
    aniVal.speak() ;  // call the Animal's method

    int sel;
    Animal *zoo [3];
    cout << "Select the animal to send to Zoo :" << endl << "(1) Dog (2) Cat (3) Lion (4) Move all animals (5) Quit" << endl;
    cin >> sel;
    switch(sel) {
        case 1:{
            Dog dog("Lassie", White, "Andy");
            zoo[0] = &dog;
            zoo[0]->speak();
            zoo[0]->move();
            break;
        }
        case 2:{
            Cat cat("Mocha", Black, "Beijia");
            zoo[0] = &cat;
            zoo[0]->speak();
            zoo[0]->move();
            break;
        }
            break;
        case 3:{
            Lion lion("Simba", Brown);
            zoo[0] = &lion;
            zoo[0]->speak();
            zoo[0]->move();
            break;
        }
        case 4:{
            Dog dog("Lassie", White, "Andy");
            Cat cat("Mocha", Black, "Beijia");
            Lion lion("Simba", Brown);
            zoo[0] = &dog;
            zoo[0]->speak();
            zoo[0]->move();
            zoo[1] = &cat;
            zoo[1]->speak();
            zoo[1]->move();
            zoo[2] = &lion;
            zoo[2]->speak();
            zoo[2]->move();
            break;
        }
        case 5:
            break;
    }


    cout << "Program exiting …. "<< endl ;
    return 0;
}