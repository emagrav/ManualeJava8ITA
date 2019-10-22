public class Connection {
    private boolean isOpen = false;
    public void open() {
        // . . . 
        isOpen = true;
        // . . . 
        assert isOpen;
    }
    public void close() throws ConnectionException {
        if (!isOpen) {
            throw new ConnectionException(
                "Impossibile chiudere connessioni non aperte!" );
        }
        // . . . 
        isOpen = false;
        // . . . 
        assert !isOpen;
    }
}
