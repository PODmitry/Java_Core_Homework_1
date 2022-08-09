package Lesson1;


import Lesson1.obstacleCourse.Course;
import Lesson1.obstacleCourse.Cross;
import Lesson1.obstacleCourse.Fight;
import Lesson1.team.Team;
import Lesson1.team.TeamMember;

public class Main {

    public static void main(String[] args) {
        Team dreamTeam = new Team("Tireds",
                new TeamMember("tired1", 4),
                new TeamMember("tired2", 5),
                new TeamMember("tired3", 6));

        Course course = new Course(new Cross(5), new Fight(6));
        course.doIt(dreamTeam);

    }
}
