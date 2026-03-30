#include <iostream>
using namespace std;
enum Status{
        IDLE,
        EXPLORING,
        SOCIAL,
        FIGHTING,
        RESTING
};
class Player{
    string name;
    Status status = IDLE;
    public:
        void checkStatus()
        {
            switch(status)
            {
                case IDLE:
                    cout << name << " is currently standing idle\n";
                    break;
                case EXPLORING:
                    cout << name << " is currently exploring Fantasia\n";
                    break;
                case SOCIAL:
                    cout << name << " is currently socializing in Old Dragon Inn\n";
                    break;
                case FIGHTING:
                    cout << name << " is currently fighting some Goblins\n";
                    break;
                case RESTING:
                    cout << name << " is currenting resting\n";
                    break;
                default:
                    cout << "Error\n";
                    break;
            }
        }
        void setStatus(Status status)
        {
            this->status = status;
        }
        void setName(string name)
        {
            this->name = name;
        }
        string getName()
        {
            return name;
        }
};
int main()
{
    Player newPlayer;
    string input;
    int numInput;
    cout << "Please enter in your name for your character: ";
    cin >> input;
    newPlayer.setName(input);
    cout << "Your name is " << newPlayer.getName() << "\n";
    cout << "1: Check Status\n";
    cout << "2: Explore\n";
    cout << "3: Socialize\n";
    cout << "4: Fight\n";
    cout << "5: Rest\n";
    cout << "6: Quit\n";
    while(true)
    {
        cout << "Please enter in an option: ";
        cin >> numInput;
        switch(numInput)
        {
            case 1: 
                newPlayer.checkStatus();
                break;
            case 2:
                newPlayer.setStatus(EXPLORING);
                break;
            case 3:
                newPlayer.setStatus(SOCIAL);
                break;
            case 4:
                newPlayer.setStatus(FIGHTING);
                break;
            case 5:
                newPlayer.setStatus(RESTING);
                break;
            case 6:
                cout << "Exiting...\n";
                return false;
            default:
                cout << "Please enter in a correct input\n";
        }
    }
    return 0;
}