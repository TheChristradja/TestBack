package org.acme.dto;

import lombok.Data;
import org.acme.model.InstructionEnum;
import org.acme.router.CarRouter;

@Data
public class CarDTO {
    private int id;
    private InstructionEnum instruction;


}
