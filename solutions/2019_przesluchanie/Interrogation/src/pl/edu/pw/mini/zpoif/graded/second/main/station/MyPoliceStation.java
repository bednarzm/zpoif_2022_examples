package pl.edu.pw.mini.zpoif.graded.second.main.station;

import pl.edu.pw.mini.zpoif.graded.second.main.interrogated.Interrogated;
import pl.edu.pw.mini.zpoif.graded.second.main.investigator.Investigator;
import pl.edu.pw.mini.zpoif.graded.second.main.investigator.Prosecutor;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Random;

public class MyPoliceStation extends PoliceStation {
    @Override
    protected void handleInterrogatedPeople(List<Interrogated> interrogators) {
        Collections.sort(interrogators, new Comparator<Interrogated>() {
            @Override
            public int compare(Interrogated o1, Interrogated o2) {
                Boolean o1w = o1 instanceof Interrogated.Witness;
                Boolean o2w = o2 instanceof Interrogated.Witness;
                if ((o1w && o2w) || (!o1w && !o2w)) return 0;
                else if (o1w && !o2w) return -1;
                else return 1;
            }
        });
        Random random = new Random();
        for(Interrogated inter : interrogators) {
            if (inter instanceof Interrogated.Witness) {
                double investigatorChance = random.nextDouble();
                Investigator inv = null;
                if (investigatorChance < 0.1) inv = new Investigator() { // 10%
                    @Override
                    public void interrogate(Interrogated interrogated) {
                        System.out.println("Ja też umiem przesłuchiwać...");
                        super.interrogate(interrogated);
                    }
                };
                else if(investigatorChance < 0.55) inv = this.new Policeman(); // 45%
                else inv = new Prosecutor(); // 45%
                if(random.nextBoolean()) {
                    this.interrogationRoom1(inter, inv);
                }
                else {
                    this.interrogationRoom2(inter, inv);
                }
            }
            else if(inter instanceof Interrogated.Suspect) {
                double investigatorChance = random.nextDouble();
                Investigator inv = null;
                if (investigatorChance < 0.05) inv = (new MyPoliceStation()).new Policeman(); //5%
                else inv = new Prosecutor(); // 95%
                this.interrogationRoom2(inter, inv);
            }
            else if(inter instanceof Interrogated.SecretAgent) {
                this.secretInterrogationRoom(inter);
            }
        }
        this.summary(new Summaryable() {
            @Override
            public int getNumberOfInterrogatedPeople() {
                return interrogators.size();
            }
        });
    }

    @Override
    protected void interrogationRoom1(Interrogated interrogated, Investigator investigator) {
        investigator.interrogate(interrogated);
    }

    @Override
    protected void interrogationRoom2(Interrogated interrogated, Investigator investigator) {
        investigator.interrogate(interrogated);
    }

    @Override
    protected void interrogationRoom3(Interrogated interrogated, Investigator investigator) {
        investigator.interrogate(interrogated);
    }

    @Override
    protected void secretInterrogationRoom(Interrogated interrogated) {
        Investigator tajniak = new Investigator() {
            @Override
            public void interrogate(Interrogated interrogated) {
                super.interrogate(interrogated);
            }
        };
        tajniak.interrogate(interrogated);
    }

    @Override
    protected void summary(Summaryable summaryable) {
        System.out.println("Przesłuchano: " + summaryable.getNumberOfInterrogatedPeople());
    }
}
