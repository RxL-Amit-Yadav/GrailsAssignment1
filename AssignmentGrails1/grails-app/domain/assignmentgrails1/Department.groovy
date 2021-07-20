package assignmentgrails1

class Department {
    String dName;
    int did;
    String location;
    static hasMany = [employee:Employee];

    Department(String dName, int did, String location) {
        this.dName = dName
        this.did = did
        this.location = location
    }
}
