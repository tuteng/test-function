package io.streamnative;

import org.apache.pulsar.functions.api.Context;
import org.apache.pulsar.functions.api.Function;

public class Person implements Function<PersonEntity.Person, PersonEntity.Person> {

    public PersonEntity.Person process(PersonEntity.Person p, Context context) throws Exception {

        if (p.getId() > 1005){
            return p;
        }
        return null;
    }

}
