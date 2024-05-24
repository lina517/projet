public class HotelRooms {
    private Map<Integer, Room> Rooms;
    private Map<Integer, Reservation> reservations;
    private int reservationCounter;

    public void Reservation(int IDchambre, String client, date dateDebut, date dateFin) {
        Room chambre = chambres.get(IDchambre);
        if (chambre == null || chambre.occupe()) {
            throw new IllegalArgumentException("Chambre non disponible.");
        }
        reservationCounter++;
        Reservation reservation = new Reservation(reservationCounter, chambre, client, dateDebut, dateFin);
        reservations.put(reservationCounter, reservation);
        chambre.reserver();
    }

    public void annulerReservation(int idReservation) {
        Reservation reservation = reservations.get(idReservation);
        if (reservation == null) {
            throw new IllegalArgumentException("Réservation introuvable.");
        }
        Date now = new Date();
        if (now.after(reservation.getdateDebut())) {
            throw new IllegalStateException("Impossible d'annuler une réservation en cours ou passée.");
        }
        reservation.getRoom().liberer();
        reservations.remove(idReservation);
    }
}
