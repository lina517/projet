public class Reservation {
     
	private int IDchambre;
    private HotelRooms type;
    private boolean existe;
    private Client IDclient;

    public Reservation(int IDchambre, HotelRooms type, boolean existe, date dateDebut, date dateFin) {
        this.IDchambre = IDchambre;
      
        this.type = type;
        this.existe = existe;
        
    }

    public int getIDchambre() {
        return IDchambre;
    }

    public void setIDchambre(int IDchambre) {
        this.IDchambre = IDchambre;
    }


    public HotelRooms getType() {
        return type;
    }

    public void setType(HotelRooms type) {
        this.type = type;
    }
    public void setclient(Client client) {
	this.IDclient = client;
}

   public Client hetclient() {
	   return IDclient;
   }

    public boolean isExiste() {
        return existe;
    }

    public void setExiste(boolean existe) {
        this.existe = existe;
    }

	public Room getRoom() {
		// TODO Auto-generated method stub
		return null;
	}

	 
}
