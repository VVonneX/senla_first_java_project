package ru.senla.user.info;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class InfoJson {
    private String seed;
    private String results;
    private String page;
    private String version;
}
