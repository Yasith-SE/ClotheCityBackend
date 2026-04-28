package edu.icet.model.dto;

import edu.icet.model.enums.Role;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class UserDto {
    private Long id;
    private String name;
    private String email;
    private String password;
    private Role role;
    private boolean isApproved;
}