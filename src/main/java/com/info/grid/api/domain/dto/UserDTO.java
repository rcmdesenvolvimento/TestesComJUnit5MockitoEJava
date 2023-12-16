package com.info.grid.api.domain.dto;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class UserDTO {

    @JsonIgnore
    private Integer id;

    private String name;
    private String email;

    // Só dá acesso somente na gravação do registro
    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    private String password;
}
