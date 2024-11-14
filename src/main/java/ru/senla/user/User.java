package ru.senla.user;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import ru.senla.user.info.InfoJson;
import ru.senla.user.results.ResultsJson;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class User {
    private InfoJson info;
    private List<ResultsJson> results;
}