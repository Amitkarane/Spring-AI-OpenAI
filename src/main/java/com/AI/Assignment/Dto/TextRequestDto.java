package com.AI.Assignment.Dto;

import jakarta.validation.constraints.NotBlank;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Data
public class TextRequestDto {
    @NotBlank(message = "Text area must be not empty!!!")
    private String text;
}
