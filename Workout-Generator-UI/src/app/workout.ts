export class Workout {
  id: number;
  name: string;
  type: WorkoutType;
  olympic: boolean;
}

enum WorkoutType {
  LEG = 'LEG',
  BICEPS = 'BICEPS',
  BACK = 'BACK',
  SHOULDER = 'SHOULDER',
  TRICEPS = 'TRICEPS',
  CHEST = 'CHEST',
  CORE = 'CORE',
  CARDIO = 'CARDIO'
}
