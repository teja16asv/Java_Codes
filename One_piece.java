class One_piece
{
static String Group="Straw hats";
String name;
String profession;
String goal;
int bounty;
static String ship="Thousand sunny";
String Attack;
String fruit;
String trainer;
String fav;
One_piece(String name,String profession,String goal,int bounty,String Attack,String fruit,String trainer,String fav)
{

this.name=name;
this.profession=profession;
this.goal=goal;
this.bounty=bounty;
this.Attack=Attack;
this.fruit=fruit;
this.trainer=trainer;
this.fav=fav;
}
public void display()
{
System.out.println("Group is - "+One_piece.Group);
System.out.println("Name is "+this.name);
System.out.println("Profession - "+this.profession);
System.out.println("Goal - s"+this.goal);
System.out.println("Bounty - "+this.bounty);
System.out.println("Ship - "+One_piece.ship);
System.out.println("Popular Attack - "+this.Attack);
System.out.println("Fruit power - "+this.fruit);
System.out.println("Trainer - "+this.trainer);
System.out.println("Fav - "+this.fav);
System.out.println();
}
public static void main(String[] args)
{
One_piece o1=new One_piece("Monkey D Luffy","Pirate","King of pirates",30000000,"Bajarang gun","gum-gum","Rayleigh","meat");
One_piece o2=new One_piece("Roronoa zoro","Vice captain","Greatest Swordsman",15000000,"Billion fold world","No fruit","Dracule mihawk","Booze");
One_piece o3=new One_piece("Black foot sanji","cook","All blue",13000000,"ifrit jamble","No fruit","Red foot Jeff","Girls");
One_piece o4=new One_piece("Nami","Navigator","Draw world map",6600000,"Thunder tempo","No fruit","Bellemere","Tangerine");
One_piece o5=new One_piece("Ussop","Sniper","King of Snipers",7800000,"Firebird star","No fruit","Herculus","Kabuto");
One_piece o6=new One_piece("Chopper","Doctor","Great doctor",100,"Monster point","Human-Human","Doctorine","Cotton candy");
One_piece o7=new One_piece("Robin","Archeologist","Collect Ponegliffs",10000000,"Cien fluer","Flower-Flower","Monkey D Dragon","Books");
One_piece o8=new One_piece("Franky","Shipwright","Build great ship",7200000,"Strong right","No fruit","Tom","Cola");
One_piece o9=new One_piece("Brook","Musician","Soul king",9600000,"Ice Solid","Soul-Soul","Null","Laboon");


o1.display();
o2.display();
o3.display();
o4.display();
o5.display();
o6.display();
o7.display();
o8.display();
o9.display();
}
}

