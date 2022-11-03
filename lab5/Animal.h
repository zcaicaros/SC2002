# include <iostream>
# include <string>

using namespace std ;
enum COLOR { Green, Blue, White, Black, Brown } ;
class Animal {

    private : 
            string _name;
            COLOR _color ;

    public : 
            Animal() : _name("unknown") {cout << "constructing Animal object "<< _name << endl ;}

            virtual ~Animal() {cout << "destructing Animal object "<< _name << endl ;}

            //pure virtual methods
            virtual void speak() = 0;
            virtual void move() = 0;

            // overload constructor
            Animal(string n, COLOR c) {
                _name = n;
                _color = c;
                cout << "constructing Animal object "<< getName() << " with " << getColor() << " color" << endl ;
            }

            // get name
            string getName() {return _name;}

            // get color
            string getColor() {
                switch(_color) {
                    case Green:
                        return "green";
                        break;
                    case Blue:
                        return "blue";
                        break;
                    case White:
                        return "white";
                        break;
                    case Black:
                        return "black";
                        break;
                    case Brown:
                        return "brown";
                        break;
                    default:
                        return "unkown";
                }
            }
};


class Mammal: public Animal{
    public: 
        // calling Animal's constructor
        Mammal(string n, COLOR c): Animal(n, c) {}
    public: 
        void eat() const {cout << "Mammal eat." << endl ;}
        // destructor
        ~Mammal(){cout << "destructing Mammal object "<< getName() << " with " << getColor() << " color" << endl ;}
        // override the pure virtual methods for not making Mammal as a abstract class
        void move(){cout << this->getName() << " moves."<< endl;};
        void speak(){cout << this->getName() << " speaks."<< endl;};
        
};


class Dog: public Mammal{
    private: 
        string owner;
    public: 
        // calling Mammal's constructor
        Dog(string n, COLOR c, string o): Mammal(n, c) {owner=o;}
        string getOwner(){return owner;}
        // destructor
        ~Dog() {cout << "destructing Dog object "<< getName() << " with " << getColor() << " color" << " of onwer " << getOwner() << endl ;}
        // override the pure virtual methods for not making Dog as a abstract class
        void speak(){cout << this->getName() << " woofs."<< endl;}
        void move(){cout << this->getName() << " runs."<< endl;};
        
};


class Cat: public Mammal{
    private: 
        string owner;
    public: 
        // calling Mammal's constructor
        Cat(string n, COLOR c, string o): Mammal(n, c) {owner=o;}
        string getOwner(){return owner;}
        // override the pure virtual methods for not making Dog as a abstract class
        void speak(){cout << this->getName() << " meows."<< endl;}
        void move(){cout << this->getName() << " runs."<< endl;};
        // destructor
        ~Cat() {cout << "destructing Cat object "<< getName() << " with " << getColor() << " color" << " of onwer " << getOwner() << endl ;}
};


class Lion: public Mammal{
    public: 
        // calling Mammal's constructor
        Lion(string n, COLOR c): Mammal(n, c) {}
        // override the pure virtual methods for not making Dog as a abstract class
        void speak(){cout << this->getName() << " roars."<< endl;}
        void move(){cout << this->getName() << " runs."<< endl;};
        // destructor
        ~Lion() {cout << "destructing Lion object "<< getName() << " with " << getColor() << " color" << endl ;}
};