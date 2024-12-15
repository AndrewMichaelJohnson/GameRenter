import {Game} from './game';


export interface GameResult {
  limit: number,
  error: string,
  results: Array<Game>,
}
