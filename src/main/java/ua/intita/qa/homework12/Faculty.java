package ua.intita.qa.homework12;

public class Faculty {
    private String heading;
    private Group[] groups;

    public Faculty(String heading, Group[] groups) {
        this.heading = heading;
        this.groups = groups;
    }

    public String getHeading() {
        return heading;
    }

    public void setHeading(String heading) {
        this.heading = heading;
    }

    public Group[] getGroups() {
        return groups;
    }

    public void setGroups(Group[] groups) {
        this.groups = groups;
    }
}
