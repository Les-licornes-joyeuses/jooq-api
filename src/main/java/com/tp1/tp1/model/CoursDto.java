package com.tp1.tp1.model;

import io.company.team.tables.mdd.routines.SigleDom;
import io.company.team.tables.mdd.routines.TitreDom;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

public  record CoursDto(String sigle, String titre, short credit) {
}

