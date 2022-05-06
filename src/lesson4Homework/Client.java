package lesson4Homework;

public class Client {
    int clientId;

    public Client(int id) {
        this.clientId = id;
    }

    public int getClientId() {
        return clientId;
    }

    public void setClientId(int clientId) {
        this.clientId = clientId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Client client = (Client) o;

        return clientId == client.clientId;
    }

    @Override
    public int hashCode() {
        return clientId;
    }

    @Override
    public String toString() {
        return "Client{" +
                "clientId=" + clientId +
                '}';
    }
}
